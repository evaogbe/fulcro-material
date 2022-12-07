(ns ogbe.fulcro.mui.icons.doorbell-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DoorbellTwoTone" :default DoorbellTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-doorbell-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoorbellTwoTone)))