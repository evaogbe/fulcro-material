(ns ogbe.fulcro.mui.icons.open-with
  #?(:cljs (:require
            ["@mui/icons-material/OpenWith" :default OpenWith]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-open-with
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpenWith)))