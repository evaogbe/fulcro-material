(ns ogbe.fulcro.mui.icons.picture-in-picture
  #?(:cljs (:require
            ["@mui/icons-material/PictureInPicture" :default PictureInPicture]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-picture-in-picture
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PictureInPicture)))