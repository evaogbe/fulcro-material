(ns ogbe.fulcro.mui.icons.line-axis
  #?(:cljs (:require
            ["@mui/icons-material/LineAxis" :default LineAxis]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-line-axis
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LineAxis)))