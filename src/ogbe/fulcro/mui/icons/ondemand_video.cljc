(ns ogbe.fulcro.mui.icons.ondemand-video
  #?(:cljs (:require
            ["@mui/icons-material/OndemandVideo" :default OndemandVideo]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ondemand-video
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OndemandVideo)))