(ns ogbe.fulcro.mui.icons.battery-saver-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BatterySaverSharp" :default BatterySaverSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery-saver-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BatterySaverSharp)))