(ns ogbe.fulcro.mui.icons.close-fullscreen
  #?(:cljs (:require
            ["@mui/icons-material/CloseFullscreen" :default CloseFullscreen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-close-fullscreen
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloseFullscreen)))