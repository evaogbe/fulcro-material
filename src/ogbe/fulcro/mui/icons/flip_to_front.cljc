(ns ogbe.fulcro.mui.icons.flip-to-front
  #?(:cljs (:require
            ["@mui/icons-material/FlipToFront" :default FlipToFront]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flip-to-front
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlipToFront)))