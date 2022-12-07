(ns ogbe.fulcro.mui.icons.mobile-screen-share
  #?(:cljs (:require
            ["@mui/icons-material/MobileScreenShare" :default MobileScreenShare]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mobile-screen-share
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MobileScreenShare)))