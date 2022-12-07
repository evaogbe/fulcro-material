(ns ogbe.fulcro.mui.icons.shutter-speed
  #?(:cljs (:require
            ["@mui/icons-material/ShutterSpeed" :default ShutterSpeed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-shutter-speed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ShutterSpeed)))