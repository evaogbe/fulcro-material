(ns ogbe.fulcro.mui.icons.flip-to-back
  #?(:cljs (:require
            ["@mui/icons-material/FlipToBack" :default FlipToBack]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-flip-to-back
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FlipToBack)))