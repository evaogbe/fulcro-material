(ns ogbe.fulcro.mui.icons.support
  #?(:cljs (:require
            ["@mui/icons-material/Support" :default Support]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-support
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Support)))