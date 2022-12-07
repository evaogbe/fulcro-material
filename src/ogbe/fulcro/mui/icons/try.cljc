(ns ogbe.fulcro.mui.icons.try
  #?(:cljs (:require
            ["@mui/icons-material/Try" :default Try]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-try
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Try)))