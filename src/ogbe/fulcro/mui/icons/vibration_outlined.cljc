(ns ogbe.fulcro.mui.icons.vibration-outlined
  #?(:cljs (:require
            ["@mui/icons-material/VibrationOutlined" :default VibrationOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-vibration-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory VibrationOutlined)))