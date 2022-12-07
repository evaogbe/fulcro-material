(ns ogbe.fulcro.mui.icons.radio
  #?(:cljs (:require
            ["@mui/icons-material/Radio" :default Radio]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-radio
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Radio)))