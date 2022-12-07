(ns ogbe.fulcro.mui.icons.twitter
  #?(:cljs (:require
            ["@mui/icons-material/Twitter" :default Twitter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-twitter
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Twitter)))