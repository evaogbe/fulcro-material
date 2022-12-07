(ns ogbe.fulcro.mui.icons.battery-saver-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BatterySaverOutlined" :default BatterySaverOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-saver-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatterySaverOutlined)))