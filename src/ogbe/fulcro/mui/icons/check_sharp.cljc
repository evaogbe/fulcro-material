(ns ogbe.fulcro.mui.icons.check-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CheckSharp" :default CheckSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CheckSharp)))