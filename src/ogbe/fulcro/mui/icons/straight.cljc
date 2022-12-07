(ns ogbe.fulcro.mui.icons.straight
  #?(:cljs (:require
            ["@mui/icons-material/Straight" :default Straight]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-straight
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Straight)))