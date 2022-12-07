(ns ogbe.fulcro.mui.icons.boy-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BoySharp" :default BoySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-boy-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BoySharp)))