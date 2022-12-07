(ns ogbe.fulcro.mui.icons.screen-share-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ScreenShareRounded" :default ScreenShareRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screen-share-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenShareRounded)))