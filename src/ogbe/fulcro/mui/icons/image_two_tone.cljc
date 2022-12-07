(ns ogbe.fulcro.mui.icons.image-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ImageTwoTone" :default ImageTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-image-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ImageTwoTone)))