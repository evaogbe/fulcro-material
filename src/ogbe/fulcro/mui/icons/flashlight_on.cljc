(ns ogbe.fulcro.mui.icons.flashlight-on
  #?(:cljs (:require
            ["@mui/icons-material/FlashlightOn" :default FlashlightOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flashlight-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlashlightOn)))