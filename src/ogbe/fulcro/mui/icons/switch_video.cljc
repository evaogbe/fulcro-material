(ns ogbe.fulcro.mui.icons.switch-video
  #?(:cljs (:require
            ["@mui/icons-material/SwitchVideo" :default SwitchVideo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-switch-video
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SwitchVideo)))