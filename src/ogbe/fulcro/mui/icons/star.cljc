(ns ogbe.fulcro.mui.icons.star
  #?(:cljs (:require
            ["@mui/icons-material/Star" :default Star]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-star
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Star)))