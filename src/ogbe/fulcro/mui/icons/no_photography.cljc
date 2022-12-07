(ns ogbe.fulcro.mui.icons.no-photography
  #?(:cljs (:require
            ["@mui/icons-material/NoPhotography" :default NoPhotography]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-no-photography
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NoPhotography)))