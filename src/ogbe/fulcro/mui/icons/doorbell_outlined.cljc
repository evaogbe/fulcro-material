(ns ogbe.fulcro.mui.icons.doorbell-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DoorbellOutlined" :default DoorbellOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-doorbell-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoorbellOutlined)))