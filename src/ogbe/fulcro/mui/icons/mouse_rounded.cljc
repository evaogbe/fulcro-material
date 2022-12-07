(ns ogbe.fulcro.mui.icons.mouse-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MouseRounded" :default MouseRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mouse-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MouseRounded)))