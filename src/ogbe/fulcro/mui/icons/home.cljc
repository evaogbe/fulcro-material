(ns ogbe.fulcro.mui.icons.home
  #?(:cljs (:require
            ["@mui/icons-material/Home" :default Home]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-home
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Home)))