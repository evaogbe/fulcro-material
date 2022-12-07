(ns ogbe.fulcro.mui.icons.mode-night
  #?(:cljs (:require
            ["@mui/icons-material/ModeNight" :default ModeNight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode-night
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModeNight)))