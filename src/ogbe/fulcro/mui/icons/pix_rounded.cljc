(ns ogbe.fulcro.mui.icons.pix-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PixRounded" :default PixRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pix-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PixRounded)))