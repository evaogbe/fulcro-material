(ns ogbe.fulcro.mui.icons.doorbell-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DoorbellRounded" :default DoorbellRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-doorbell-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoorbellRounded)))