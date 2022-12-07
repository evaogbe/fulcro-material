(ns ogbe.fulcro.mui.icons.living
  #?(:cljs (:require
            ["@mui/icons-material/Living" :default Living]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-living
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Living)))