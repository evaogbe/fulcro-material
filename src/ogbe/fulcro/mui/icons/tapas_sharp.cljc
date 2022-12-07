(ns ogbe.fulcro.mui.icons.tapas-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TapasSharp" :default TapasSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tapas-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TapasSharp)))