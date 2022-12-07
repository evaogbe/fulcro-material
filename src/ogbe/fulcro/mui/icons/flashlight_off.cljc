(ns ogbe.fulcro.mui.icons.flashlight-off
  #?(:cljs (:require
            ["@mui/icons-material/FlashlightOff" :default FlashlightOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flashlight-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlashlightOff)))