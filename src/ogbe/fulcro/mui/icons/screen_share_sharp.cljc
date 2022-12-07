(ns ogbe.fulcro.mui.icons.screen-share-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ScreenShareSharp" :default ScreenShareSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screen-share-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenShareSharp)))