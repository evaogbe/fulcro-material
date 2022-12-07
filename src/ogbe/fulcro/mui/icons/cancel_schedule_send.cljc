(ns ogbe.fulcro.mui.icons.cancel-schedule-send
  #?(:cljs (:require
            ["@mui/icons-material/CancelScheduleSend" :default CancelScheduleSend]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cancel-schedule-send
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CancelScheduleSend)))