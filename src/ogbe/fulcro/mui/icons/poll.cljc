(ns ogbe.fulcro.mui.icons.poll
  #?(:cljs (:require
            ["@mui/icons-material/Poll" :default Poll]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-poll
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Poll)))