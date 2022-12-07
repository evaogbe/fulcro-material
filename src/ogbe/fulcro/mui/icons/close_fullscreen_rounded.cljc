(ns ogbe.fulcro.mui.icons.close-fullscreen-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CloseFullscreenRounded" :default CloseFullscreenRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-close-fullscreen-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CloseFullscreenRounded)))