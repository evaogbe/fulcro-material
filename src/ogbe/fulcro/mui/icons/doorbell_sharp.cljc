(ns ogbe.fulcro.mui.icons.doorbell-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DoorbellSharp" :default DoorbellSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-doorbell-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoorbellSharp)))