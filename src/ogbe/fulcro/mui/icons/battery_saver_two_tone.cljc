(ns ogbe.fulcro.mui.icons.battery-saver-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/BatterySaverTwoTone" :default BatterySaverTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-saver-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatterySaverTwoTone)))