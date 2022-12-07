(ns ogbe.fulcro.mui.icons.mode-standby
  #?(:cljs (:require
            ["@mui/icons-material/ModeStandby" :default ModeStandby]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode-standby
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModeStandby)))