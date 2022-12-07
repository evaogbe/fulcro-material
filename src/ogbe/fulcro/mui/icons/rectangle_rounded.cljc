(ns ogbe.fulcro.mui.icons.rectangle-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RectangleRounded" :default RectangleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rectangle-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RectangleRounded)))