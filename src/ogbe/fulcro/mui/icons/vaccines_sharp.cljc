(ns ogbe.fulcro.mui.icons.vaccines-sharp
  #?(:cljs (:require
            ["@mui/icons-material/VaccinesSharp" :default VaccinesSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vaccines-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VaccinesSharp)))