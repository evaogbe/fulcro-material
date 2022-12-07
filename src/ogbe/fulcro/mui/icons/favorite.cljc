(ns ogbe.fulcro.mui.icons.favorite
  #?(:cljs (:require
            ["@mui/icons-material/Favorite" :default Favorite]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-favorite
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Favorite)))