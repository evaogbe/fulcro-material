(ns ogbe.fulcro.mui.icons.tv
  #?(:cljs (:require
            ["@mui/icons-material/Tv" :default Tv]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tv
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Tv)))