(ns ogbe.fulcro.mui.icons.http-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/HttpTwoTone" :default HttpTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-http-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HttpTwoTone)))