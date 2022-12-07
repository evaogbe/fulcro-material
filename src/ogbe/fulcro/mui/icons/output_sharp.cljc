(ns ogbe.fulcro.mui.icons.output-sharp
  #?(:cljs (:require
            ["@mui/icons-material/OutputSharp" :default OutputSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-output-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutputSharp)))