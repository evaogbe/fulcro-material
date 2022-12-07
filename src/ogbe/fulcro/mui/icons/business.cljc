(ns ogbe.fulcro.mui.icons.business
  #?(:cljs (:require
            ["@mui/icons-material/Business" :default Business]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-business
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Business)))