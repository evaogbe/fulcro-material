(ns ogbe.fulcro.mui.icons.picture-in-picture-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PictureInPictureRounded" :default PictureInPictureRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-picture-in-picture-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PictureInPictureRounded)))