(ns ogbe.fulcro.mui.icons.portrait-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PortraitRounded" :default PortraitRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-portrait-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PortraitRounded)))