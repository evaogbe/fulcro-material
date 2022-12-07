(ns ogbe.fulcro.mui.icons.api-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ApiTwoTone" :default ApiTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-api-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ApiTwoTone)))