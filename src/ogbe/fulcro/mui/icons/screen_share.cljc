(ns ogbe.fulcro.mui.icons.screen-share
  #?(:cljs (:require
            ["@mui/icons-material/ScreenShare" :default ScreenShare]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-screen-share
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ScreenShare)))