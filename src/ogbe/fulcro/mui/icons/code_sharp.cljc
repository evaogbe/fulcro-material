(ns ogbe.fulcro.mui.icons.code-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CodeSharp" :default CodeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-code-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CodeSharp)))