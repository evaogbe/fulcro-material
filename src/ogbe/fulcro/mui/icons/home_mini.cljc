(ns ogbe.fulcro.mui.icons.home-mini
  #?(:cljs (:require
            ["@mui/icons-material/HomeMini" :default HomeMini]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-home-mini
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HomeMini)))